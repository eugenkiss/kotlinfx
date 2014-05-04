// http://www.programcreek.com/2011/11/use-jdt-astparser-to-parse-java-file/
package example2

import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.Block
import org.eclipse.jdt.core.dom.SimpleName
import org.eclipse.jdt.core.dom.ASTVisitor
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jdt.core.dom.VariableDeclarationFragment
import org.eclipse.jdt.core.JavaCore
import java.io.IOException
import java.io.BufferedReader
import java.io.FileReader
import java.io.File

fun main(args: Array<String>) {
    // Just a path to a directory that contains some JavaFX 8 source files
    parseFilesInDir("/tmp/test")
}

// Use ARTParse to parse string
fun parse(str: String) {
    val parser = ASTParser.newParser(AST.JLS8)!!
    parser.setSource(str.toCharArray())
    parser.setKind(ASTParser.K_COMPILATION_UNIT)

    val options = JavaCore.getOptions()
    JavaCore.setComplianceOptions(JavaCore.VERSION_1_8, options)
    parser.setCompilerOptions(options)

    val cu = parser.createAST(null) as CompilationUnit
    cu.accept(object : ASTVisitor() {
        val names: MutableSet<String> = hashSetOf()

        fun visit(node: VariableDeclarationFragment): Boolean {
            val name = node.getName()!!
            names.add(name.getIdentifier()!!)
            println("Declaration of '$name' at line ${cu.getLineNumber(name.getStartPosition())}")
            return false
        }
        fun visit(node: SimpleName): Boolean {
            if (names.contains(node.getIdentifier()))
                println("Usage of '$node' at line ${cu.getLineNumber(node.getStartPosition())}")
            return true
        }
    })
}

// Read file content into a string
fun readFileToString(filePath: String): String {
    val fileData = StringBuilder(1000)
    val reader = BufferedReader(FileReader(filePath))

    var buf = CharArray(10)
    var numRead = 0
    while (true) {
        numRead = reader.read(buf)
        if (numRead == -1) break
        println(numRead)
        val readData = java.lang.String.valueOf(buf, 0, numRead)
        fileData.append(readData)
        buf = CharArray(1024)
    }
    reader.close()

    return fileData.toString()
}

// Loop directory to get file list
fun parseFilesInDir(dirPath: String) {
//    val dirs = File(dir)
//    val dirPath = dirs.getCanonicalPath() + File.separator+"src"+File.separator
    val root = File(dirPath)
    val files = root.listFiles()!!
    println(files)

    for (f in files) {
        if (f.isFile())
            parse(readFileToString(f.getAbsolutePath()))
    }
}
