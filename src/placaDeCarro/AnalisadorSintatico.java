
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package placaDeCarro;

import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class AnalisadorSintatico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public AnalisadorSintatico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalisadorSintatico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalisadorSintatico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\004\005\000\002\004\005" +
    "\000\002\004\003\000\002\004\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\006\007\010\011\005\001\002\000\010\002" +
    "\uffff\007\uffff\011\uffff\001\002\000\006\007\010\011\005" +
    "\001\002\000\004\004\017\001\002\000\010\002\016\007" +
    "\010\011\005\001\002\000\010\004\ufffb\005\011\006\012" +
    "\001\002\000\006\007\010\011\005\001\002\000\006\007" +
    "\010\011\005\001\002\000\004\004\ufffc\001\002\000\004" +
    "\004\ufffd\001\002\000\010\002\001\007\001\011\001\001" +
    "\002\000\004\002\000\001\002\000\010\002\ufffe\007\ufffe" +
    "\011\ufffe\001\002\000\004\004\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\010\002\006\003\003\004\005\001\001\000" +
    "\002\001\001\000\004\004\017\001\001\000\002\001\001" +
    "\000\006\003\014\004\005\001\001\000\002\001\001\000" +
    "\004\004\013\001\001\000\004\004\012\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalisadorSintatico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalisadorSintatico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalisadorSintatico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$AnalisadorSintatico$actions {
  private final AnalisadorSintatico parser;

  /** Constructor */
  CUP$AnalisadorSintatico$actions(AnalisadorSintatico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalisadorSintatico$do_action_part00000000(
    int                        CUP$AnalisadorSintatico$act_num,
    java_cup.runtime.lr_parser CUP$AnalisadorSintatico$parser,
    java.util.Stack            CUP$AnalisadorSintatico$stack,
    int                        CUP$AnalisadorSintatico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalisadorSintatico$result;

      /* select the action based on the action number */
      switch (CUP$AnalisadorSintatico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_ptv 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)).value;
		RESULT = start_val;
              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalisadorSintatico$parser.done_parsing();
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_ptv 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr_ptv ::= expr PTVIRG 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr_ptv",1, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= INTEIRO MAIS expr 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= INTEIRO MENOS expr 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= INTEIRO 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= PLACA expr 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalisadorSintatico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalisadorSintatico$do_action(
    int                        CUP$AnalisadorSintatico$act_num,
    java_cup.runtime.lr_parser CUP$AnalisadorSintatico$parser,
    java.util.Stack            CUP$AnalisadorSintatico$stack,
    int                        CUP$AnalisadorSintatico$top)
    throws java.lang.Exception
    {
              return CUP$AnalisadorSintatico$do_action_part00000000(
                               CUP$AnalisadorSintatico$act_num,
                               CUP$AnalisadorSintatico$parser,
                               CUP$AnalisadorSintatico$stack,
                               CUP$AnalisadorSintatico$top);
    }
}

}