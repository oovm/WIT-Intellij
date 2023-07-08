// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.projectfluent.language.psi.FluentTypes.*;
import static com.github.projectfluent.language.psi.FluentParserExtension.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FluentParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return wit(b, l + 1);
  }

  /* ********************************************************** */
  // DOT SYMBOL
  public static boolean AttributeID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeID")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, SYMBOL);
    exit_section_(b, m, ATTRIBUTE_ID, r);
    return r;
  }

  /* ********************************************************** */
  // InlineText+
  public static boolean BlockText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockText")) return false;
    if (!nextTokenIs(b, "<block text>", SELECTION_LINE, TEXT_LINE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_TEXT, "<block text>");
    r = InlineText(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!InlineText(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockText", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean FunctionID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionID")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, FUNCTION_ID, r);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L (import | expression) BRACE_R
  public static boolean InlinePlaceable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlinePlaceable")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && InlinePlaceable_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, INLINE_PLACEABLE, r);
    return r;
  }

  // import | expression
  private static boolean InlinePlaceable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlinePlaceable_1")) return false;
    boolean r;
    r = import_$(b, l + 1);
    if (!r) r = expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // TEXT_LINE | SELECTION_LINE
  public static boolean InlineText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineText")) return false;
    if (!nextTokenIs(b, "<inline text>", SELECTION_LINE, TEXT_LINE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INLINE_TEXT, "<inline text>");
    r = consumeToken(b, TEXT_LINE);
    if (!r) r = consumeToken(b, SELECTION_LINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INTEGER | DECIMAL
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    if (!nextTokenIs(b, "<number literal>", DECIMAL, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LITERAL, "<number literal>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DECIMAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_QUOTE (STRING_ESCAPE|STRING_CHAR)* STRING_QUOTE
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, STRING_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_QUOTE);
    r = r && StringLiteral_1(b, l + 1);
    r = r && consumeToken(b, STRING_QUOTE);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  // (STRING_ESCAPE|STRING_CHAR)*
  private static boolean StringLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StringLiteral_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringLiteral_1", c)) break;
    }
    return true;
  }

  // STRING_ESCAPE|STRING_CHAR
  private static boolean StringLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_ESCAPE);
    if (!r) r = consumeToken(b, STRING_CHAR);
    return r;
  }

  /* ********************************************************** */
  // DOLLAR SYMBOL
  public static boolean VariableID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableID")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOLLAR, SYMBOL);
    exit_section_(b, m, VARIABLE_ID, r);
    return r;
  }

  /* ********************************************************** */
  // BLANK_BLOCK  InlinePlaceable
  public static boolean block_placeable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_placeable")) return false;
    if (!nextTokenIs(b, BLANK_BLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BLANK_BLOCK);
    r = r && InlinePlaceable(b, l + 1);
    exit_section_(b, m, BLOCK_PLACEABLE, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ENUM identifier BRACE_L (identifier (COMMA identifier)* COMMA?)? BRACE_R
  public static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM, null);
    r = consumeToken(b, KW_ENUM);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, enum_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (identifier (COMMA identifier)* COMMA?)?
  private static boolean enum_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3")) return false;
    enum_3_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)* COMMA?
  private static boolean enum_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && enum_3_0_1(b, l + 1);
    r = r && enum_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean enum_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean enum_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean enum_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // KW_EXPORT interface-name
  public static boolean export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export")) return false;
    if (!nextTokenIs(b, KW_EXPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPORT, null);
    r = consumeToken(b, KW_EXPORT);
    p = r; // pin = 1
    r = r && interface_name(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // StringLiteral
  //   | NumberLiteral
  //   | record
  //   | resource
  //   | record-field
  //   | VariableID
  //   | InlinePlaceable
  static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    r = StringLiteral(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = record(b, l + 1);
    if (!r) r = resource(b, l + 1);
    if (!r) r = record_field(b, l + 1);
    if (!r) r = VariableID(b, l + 1);
    if (!r) r = InlinePlaceable(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_FLAGS identifier BRACE_L (identifier (COMMA identifier)* COMMA?)? BRACE_R
  public static boolean flags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags")) return false;
    if (!nextTokenIs(b, KW_FLAGS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FLAGS, null);
    r = consumeToken(b, KW_FLAGS);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, flags_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (identifier (COMMA identifier)* COMMA?)?
  private static boolean flags_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3")) return false;
    flags_3_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)* COMMA?
  private static boolean flags_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && flags_3_0_1(b, l + 1);
    r = r && flags_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean flags_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!flags_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "flags_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean flags_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean flags_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier COLON function-signature {
  // //	mixin = "com.github.projectfluent.language.mixin.MixinFunction"
  // }
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && function_signature(b, l + 1);
    r = r && function_3(b, l + 1);
    exit_section_(b, m, FUNCTION, r);
    return r;
  }

  // {
  // //	mixin = "com.github.projectfluent.language.mixin.MixinFunction"
  // }
  private static boolean function_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // PARENTHESIS_L (parameter (COMMA parameter)* COMMA?)? PARENTHESIS_R
  static boolean function_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_args")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && function_args_1(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // (parameter (COMMA parameter)* COMMA?)?
  private static boolean function_args_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_args_1")) return false;
    function_args_1_0(b, l + 1);
    return true;
  }

  // parameter (COMMA parameter)* COMMA?
  private static boolean function_args_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_args_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && function_args_1_0_1(b, l + 1);
    r = r && function_args_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)*
  private static boolean function_args_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_args_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_args_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_args_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean function_args_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_args_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean function_args_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_args_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier? KW_FUNCTION function-args (TO type-hint)?
  public static boolean function_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature")) return false;
    if (!nextTokenIs(b, "<function signature>", KW_FUNCTION, SYMBOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_SIGNATURE, "<function signature>");
    r = function_signature_0(b, l + 1);
    r = r && consumeToken(b, KW_FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, function_args(b, l + 1));
    r = p && function_signature_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // identifier?
  private static boolean function_signature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_0")) return false;
    identifier(b, l + 1);
    return true;
  }

  // (TO type-hint)?
  private static boolean function_signature_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_3")) return false;
    function_signature_3_0(b, l + 1);
    return true;
  }

  // TO type-hint
  private static boolean function_signature_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && type_hint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANGLE_L (type-hint (COMMA type-hint)* COMMA?)? ANGLE_R
  public static boolean generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic")) return false;
    if (!nextTokenIs(b, ANGLE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANGLE_L);
    r = r && generic_1(b, l + 1);
    r = r && consumeToken(b, ANGLE_R);
    exit_section_(b, m, GENERIC, r);
    return r;
  }

  // (type-hint (COMMA type-hint)* COMMA?)?
  private static boolean generic_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1")) return false;
    generic_1_0(b, l + 1);
    return true;
  }

  // type-hint (COMMA type-hint)* COMMA?
  private static boolean generic_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_hint(b, l + 1);
    r = r && generic_1_0_1(b, l + 1);
    r = r && generic_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA type-hint)*
  private static boolean generic_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA type-hint
  private static boolean generic_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_hint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean generic_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT include-name
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT, null);
    r = consumeToken(b, KW_IMPORT);
    p = r; // pin = 1
    r = r && include_name(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // KW_INCLUDE include-name
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, KW_INCLUDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE, null);
    r = consumeToken(b, KW_INCLUDE);
    p = r; // pin = 1
    r = r && include_name(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier (COLON identifier)? (SLASH interface-name)? (AT VERSION)?
  public static boolean include_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && include_name_1(b, l + 1);
    r = r && include_name_2(b, l + 1);
    r = r && include_name_3(b, l + 1);
    exit_section_(b, m, INCLUDE_NAME, r);
    return r;
  }

  // (COLON identifier)?
  private static boolean include_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_1")) return false;
    include_name_1_0(b, l + 1);
    return true;
  }

  // COLON identifier
  private static boolean include_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SLASH interface-name)?
  private static boolean include_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_2")) return false;
    include_name_2_0(b, l + 1);
    return true;
  }

  // SLASH interface-name
  private static boolean include_name_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLASH);
    r = r && interface_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AT VERSION)?
  private static boolean include_name_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_3")) return false;
    include_name_3_0(b, l + 1);
    return true;
  }

  // AT VERSION
  private static boolean include_name_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, VERSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_INTERFACE interface-name BRACE_L interface-element* BRACE_R
  public static boolean interface_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_$")) return false;
    if (!nextTokenIs(b, KW_INTERFACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE, null);
    r = consumeToken(b, KW_INTERFACE);
    p = r; // pin = 1
    r = r && report_error_(b, interface_name(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, interface_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // interface-element*
  private static boolean interface_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // use
  //   | type
  //   | resource
  //   | record
  //   | flags
  //   | enum
  //   | variant
  //   | function
  //   | SEMICOLON
  static boolean interface_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_element")) return false;
    boolean r;
    r = use(b, l + 1);
    if (!r) r = type(b, l + 1);
    if (!r) r = resource(b, l + 1);
    if (!r) r = record(b, l + 1);
    if (!r) r = flags(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = variant(b, l + 1);
    if (!r) r = function(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean interface_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, INTERFACE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean module_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, MODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PACKAGE package-name
  public static boolean package_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_$")) return false;
    if (!nextTokenIs(b, KW_PACKAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE, null);
    r = consumeToken(b, KW_PACKAGE);
    p = r; // pin = 1
    r = r && package_name(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier (COLON identifier)? (AT VERSION)?
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && package_name_1(b, l + 1);
    r = r && package_name_2(b, l + 1);
    exit_section_(b, m, PACKAGE_NAME, r);
    return r;
  }

  // (COLON identifier)?
  private static boolean package_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1")) return false;
    package_name_1_0(b, l + 1);
    return true;
  }

  // COLON identifier
  private static boolean package_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AT VERSION)?
  private static boolean package_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_2")) return false;
    package_name_2_0(b, l + 1);
    return true;
  }

  // AT VERSION
  private static boolean package_name_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, VERSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON type-hint {
  // }
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_hint(b, l + 1);
    r = r && parameter_3(b, l + 1);
    exit_section_(b, m, PARAMETER, r);
    return r;
  }

  // {
  // }
  private static boolean parameter_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // KW_RECORD identifier BRACE_L record-element* BRACE_R
  public static boolean record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record")) return false;
    if (!nextTokenIs(b, KW_RECORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD, null);
    r = consumeToken(b, KW_RECORD);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, record_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // record-element*
  private static boolean record_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // record-field
  //   | COMMA
  static boolean record_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_element")) return false;
    if (!nextTokenIs(b, "", COMMA, SYMBOL)) return false;
    boolean r;
    r = record_field(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON type-hint
  public static boolean record_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_field")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_hint(b, l + 1);
    exit_section_(b, m, RECORD_FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // KW_RESOURCE identifier BRACE_L resource-element* BRACE_R
  public static boolean resource(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource")) return false;
    if (!nextTokenIs(b, KW_RESOURCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE, null);
    r = consumeToken(b, KW_RESOURCE);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, resource_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // resource-element*
  private static boolean resource_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!resource_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "resource_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // function
  //   | SEMICOLON
  static boolean resource_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_element")) return false;
    if (!nextTokenIs(b, "", SEMICOLON, SYMBOL)) return false;
    boolean r;
    r = function(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean semantic_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semantic_number")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, SEMANTIC_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // package
  //   | world
  //   | include
  //   | interface
  //   | SEMICOLON
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    r = package_$(b, l + 1);
    if (!r) r = world(b, l + 1);
    if (!r) r = include(b, l + 1);
    if (!r) r = interface_$(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // KW_TYPE identifier EQ type-hint
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, KW_TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE, null);
    r = consumeToken(b, KW_TYPE);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, EQ)) && r;
    r = p && type_hint(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier generic?
  public static boolean type_hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && type_hint_1(b, l + 1);
    exit_section_(b, m, TYPE_HINT, r);
    return r;
  }

  // generic?
  private static boolean type_hint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint_1")) return false;
    generic(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_USE (include-name|interface-name) use-items?
  public static boolean use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use")) return false;
    if (!nextTokenIs(b, KW_USE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USE, null);
    r = consumeToken(b, KW_USE);
    p = r; // pin = 1
    r = r && report_error_(b, use_1(b, l + 1));
    r = p && use_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // include-name|interface-name
  private static boolean use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1")) return false;
    boolean r;
    r = include_name(b, l + 1);
    if (!r) r = interface_name(b, l + 1);
    return r;
  }

  // use-items?
  private static boolean use_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_2")) return false;
    use_items(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT BRACE_L (identifier (COMMA identifier)* COMMA?)? BRACE_R
  public static boolean use_items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_items")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USE_ITEMS, null);
    r = consumeTokens(b, 1, DOT, BRACE_L);
    p = r; // pin = 1
    r = r && report_error_(b, use_items_2(b, l + 1));
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (identifier (COMMA identifier)* COMMA?)?
  private static boolean use_items_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_items_2")) return false;
    use_items_2_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)* COMMA?
  private static boolean use_items_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_items_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && use_items_2_0_1(b, l + 1);
    r = r && use_items_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean use_items_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_items_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_items_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_items_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean use_items_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_items_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean use_items_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_items_2_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // KW_VARIANT identifier BRACE_L (variant-item (COMMA variant-item)* COMMA?)? BRACE_R
  public static boolean variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant")) return false;
    if (!nextTokenIs(b, KW_VARIANT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIANT, null);
    r = consumeToken(b, KW_VARIANT);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, variant_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (variant-item (COMMA variant-item)* COMMA?)?
  private static boolean variant_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3")) return false;
    variant_3_0(b, l + 1);
    return true;
  }

  // variant-item (COMMA variant-item)* COMMA?
  private static boolean variant_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variant_item(b, l + 1);
    r = r && variant_3_0_1(b, l + 1);
    r = r && variant_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA variant-item)*
  private static boolean variant_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variant_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variant_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA variant-item
  private static boolean variant_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variant_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean variant_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier (PARENTHESIS_L type-hint PARENTHESIS_R)?
  public static boolean variant_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_item")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && variant_item_1(b, l + 1);
    exit_section_(b, m, VARIANT_ITEM, r);
    return r;
  }

  // (PARENTHESIS_L type-hint PARENTHESIS_R)?
  private static boolean variant_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_item_1")) return false;
    variant_item_1_0(b, l + 1);
    return true;
  }

  // PARENTHESIS_L type-hint PARENTHESIS_R
  private static boolean variant_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && type_hint(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statements*
  static boolean wit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wit")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "wit", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_WORLD identifier BRACE_L world-element* BRACE_R
  public static boolean world(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "world")) return false;
    if (!nextTokenIs(b, KW_WORLD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WORLD, null);
    r = consumeToken(b, KW_WORLD);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, world_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // world-element*
  private static boolean world_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "world_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!world_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "world_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // include
  //   | import
  //   | export
  //   | use
  //   | SEMICOLON
  //   | COMMENT_LINE
  static boolean world_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "world_element")) return false;
    boolean r;
    r = include(b, l + 1);
    if (!r) r = import_$(b, l + 1);
    if (!r) r = export(b, l + 1);
    if (!r) r = use(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMENT_LINE);
    return r;
  }

}
