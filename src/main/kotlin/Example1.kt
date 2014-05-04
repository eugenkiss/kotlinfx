// http://www.programcreek.com/2012/08/parse-a-sequence-of-java-statements-by-using-jdt-astparser/
package example1

import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.Block
import org.eclipse.jdt.core.dom.SimpleName
import org.eclipse.jdt.core.dom.ASTVisitor

fun main(args: Array<String>) {
    val parser = ASTParser.newParser(AST.JLS8)!!
    parser.setSource("int i = 9; \n int j = i+1;".toCharArray())

    parser.setKind(ASTParser.K_STATEMENTS)

    val block = parser.createAST(null) as Block

    // here can access the first element of the returned statement list
    val str = block.statements()!!.get(0).toString()

    println(str)

    block.accept(object : ASTVisitor() {
        public fun visit(node: SimpleName): Boolean {
            println("Name: " + node.getFullyQualifiedName())
            return true
        }
    })
}
