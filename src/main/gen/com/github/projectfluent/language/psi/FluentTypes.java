// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.projectfluent.language.psi_node.*;

public interface FluentTypes {

  IElementType ARGUMENT = new FluentElementType("ARGUMENT");
  IElementType ATTRIBUTE_ID = new FluentElementType("ATTRIBUTE_ID");
  IElementType BLOCK_PLACEABLE = new FluentElementType("BLOCK_PLACEABLE");
  IElementType BLOCK_TEXT = new FluentElementType("BLOCK_TEXT");
  IElementType CALL_ARGUMENTS = new FluentElementType("CALL_ARGUMENTS");
  IElementType DEFAULT_VARIANT = new FluentElementType("DEFAULT_VARIANT");
  IElementType FUNCTION = new FluentElementType("FUNCTION");
  IElementType FUNCTION_ID = new FluentElementType("FUNCTION_ID");
  IElementType FUNCTION_REFERENCE = new FluentElementType("FUNCTION_REFERENCE");
  IElementType FUNCTION_SIGNATURE = new FluentElementType("FUNCTION_SIGNATURE");
  IElementType IDENTIFIER = new FluentElementType("IDENTIFIER");
  IElementType INCLUDE = new FluentElementType("INCLUDE");
  IElementType INCLUDE_NAME = new FluentElementType("INCLUDE_NAME");
  IElementType INLINE_PLACEABLE = new FluentElementType("INLINE_PLACEABLE");
  IElementType INLINE_TEXT = new FluentElementType("INLINE_TEXT");
  IElementType INTERFACE = new FluentElementType("INTERFACE");
  IElementType MESSAGE_ID = new FluentElementType("MESSAGE_ID");
  IElementType MESSAGE_REFERENCE = new FluentElementType("MESSAGE_REFERENCE");
  IElementType NAMED_ARGUMENT = new FluentElementType("NAMED_ARGUMENT");
  IElementType NUMBER_LITERAL = new FluentElementType("NUMBER_LITERAL");
  IElementType PACKAGE = new FluentElementType("PACKAGE");
  IElementType PACKAGE_NAME = new FluentElementType("PACKAGE_NAME");
  IElementType PARAMETER = new FluentElementType("PARAMETER");
  IElementType SELECT_EXPRESSION = new FluentElementType("SELECT_EXPRESSION");
  IElementType STRING_LITERAL = new FluentElementType("STRING_LITERAL");
  IElementType TERM_ID = new FluentElementType("TERM_ID");
  IElementType TERM_REFERENCE = new FluentElementType("TERM_REFERENCE");
  IElementType TYPE = new FluentElementType("TYPE");
  IElementType TYPE_HINT = new FluentElementType("TYPE_HINT");
  IElementType VARIABLE_ID = new FluentElementType("VARIABLE_ID");
  IElementType VARIANT = new FluentElementType("VARIANT");
  IElementType VARIANT_KEY = new FluentElementType("VARIANT_KEY");
  IElementType WORLD = new FluentElementType("WORLD");

  IElementType ACCENT = new FluentTokenType("^");
  IElementType ANGLE_L = new FluentTokenType("<");
  IElementType ANGLE_R = new FluentTokenType(">");
  IElementType AT = new FluentTokenType("@");
  IElementType BLANK_BLOCK = new FluentTokenType("BLANK_BLOCK");
  IElementType BRACE_L = new FluentTokenType("{");
  IElementType BRACE_R = new FluentTokenType("}");
  IElementType BRACKET_L = new FluentTokenType("[");
  IElementType BRACKET_R = new FluentTokenType("]");
  IElementType COLON = new FluentTokenType(":");
  IElementType COMMA = new FluentTokenType(",");
  IElementType COMMENT = new FluentTokenType("Comment");
  IElementType COMMENT_BLOCK = new FluentTokenType("Comment Block");
  IElementType COMMENT_DOCUMENT = new FluentTokenType("Comment Document");
  IElementType COMMENT_LINE = new FluentTokenType("COMMENT_LINE");
  IElementType DECIMAL = new FluentTokenType("DECIMAL");
  IElementType DOLLAR = new FluentTokenType("$");
  IElementType DOT = new FluentTokenType(".");
  IElementType EQ = new FluentTokenType("=");
  IElementType FUNCTION_RETURN = new FluentTokenType("function-return");
  IElementType HYPHEN = new FluentTokenType("-");
  IElementType INTEGER = new FluentTokenType("INTEGER");
  IElementType KW_FUNCTION = new FluentTokenType("KW_FUNCTION");
  IElementType KW_IMPORT = new FluentTokenType("import");
  IElementType KW_INCLUDE = new FluentTokenType("include");
  IElementType KW_INTERFACE = new FluentTokenType("interface");
  IElementType KW_PACKAGE = new FluentTokenType("package");
  IElementType KW_RECORD = new FluentTokenType("record");
  IElementType KW_TYPE = new FluentTokenType("type");
  IElementType KW_USE = new FluentTokenType("use");
  IElementType KW_WORLD = new FluentTokenType("world");
  IElementType PARENTHESIS_L = new FluentTokenType("(");
  IElementType PARENTHESIS_R = new FluentTokenType(")");
  IElementType SELECTION_LINE = new FluentTokenType("SELECTION_LINE");
  IElementType SEMICOLON = new FluentTokenType(";");
  IElementType SLASH = new FluentTokenType("/");
  IElementType STAR = new FluentTokenType("*");
  IElementType STRING_CHAR = new FluentTokenType("String Character");
  IElementType STRING_ESCAPE = new FluentTokenType("String Escaped");
  IElementType STRING_QUOTE = new FluentTokenType("String Quote");
  IElementType SYMBOL = new FluentTokenType("Symbol");
  IElementType TEXT_LINE = new FluentTokenType("TEXT_LINE");
  IElementType TO = new FluentTokenType("->");
  IElementType URL = new FluentTokenType("Url");
  IElementType VERSION = new FluentTokenType("<<semver>>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT) {
        return new FluentArgumentNode(node);
      }
      else if (type == ATTRIBUTE_ID) {
        return new FluentAttributeIDNode(node);
      }
      else if (type == BLOCK_PLACEABLE) {
        return new FluentBlockPlaceableNode(node);
      }
      else if (type == BLOCK_TEXT) {
        return new FluentBlockTextNode(node);
      }
      else if (type == CALL_ARGUMENTS) {
        return new FluentCallArgumentsNode(node);
      }
      else if (type == DEFAULT_VARIANT) {
        return new FluentDefaultVariantNode(node);
      }
      else if (type == FUNCTION) {
        return new FluentFunctionNode(node);
      }
      else if (type == FUNCTION_ID) {
        return new FluentFunctionIDNode(node);
      }
      else if (type == FUNCTION_REFERENCE) {
        return new FluentFunctionReferenceNode(node);
      }
      else if (type == FUNCTION_SIGNATURE) {
        return new FluentFunctionSignatureNode(node);
      }
      else if (type == IDENTIFIER) {
        return new FluentIdentifierNode(node);
      }
      else if (type == INCLUDE) {
        return new FluentIncludeNode(node);
      }
      else if (type == INCLUDE_NAME) {
        return new FluentIncludeNameNode(node);
      }
      else if (type == INLINE_PLACEABLE) {
        return new FluentInlinePlaceableNode(node);
      }
      else if (type == INLINE_TEXT) {
        return new FluentInlineTextNode(node);
      }
      else if (type == INTERFACE) {
        return new FluentInterfaceNode(node);
      }
      else if (type == MESSAGE_ID) {
        return new FluentMessageIDNode(node);
      }
      else if (type == MESSAGE_REFERENCE) {
        return new FluentMessageReferenceNode(node);
      }
      else if (type == NAMED_ARGUMENT) {
        return new FluentNamedArgumentNode(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new FluentNumberLiteralNode(node);
      }
      else if (type == PACKAGE) {
        return new FluentPackageNode(node);
      }
      else if (type == PACKAGE_NAME) {
        return new FluentPackageNameNode(node);
      }
      else if (type == PARAMETER) {
        return new FluentParameterNode(node);
      }
      else if (type == SELECT_EXPRESSION) {
        return new FluentSelectExpressionNode(node);
      }
      else if (type == STRING_LITERAL) {
        return new FluentStringLiteralNode(node);
      }
      else if (type == TERM_ID) {
        return new FluentTermIDNode(node);
      }
      else if (type == TERM_REFERENCE) {
        return new FluentTermReferenceNode(node);
      }
      else if (type == TYPE) {
        return new FluentTypeNode(node);
      }
      else if (type == TYPE_HINT) {
        return new FluentTypeHintNode(node);
      }
      else if (type == VARIABLE_ID) {
        return new FluentVariableIDNode(node);
      }
      else if (type == VARIANT) {
        return new FluentVariantNode(node);
      }
      else if (type == VARIANT_KEY) {
        return new FluentVariantKeyNode(node);
      }
      else if (type == WORLD) {
        return new FluentWorldNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
