/* Generated By:JJTree: Do not edit this line. ASTBNFSequence.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.javacc.jjtree;

public class ASTBNFSequence extends JJTreeNode{
  public ASTBNFSequence(int id) {
    super(id);
  }

  public ASTBNFSequence(JJTreeParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JJTreeParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f373752f049f8f70ee9407ea92e016b6 (do not edit this line) */
