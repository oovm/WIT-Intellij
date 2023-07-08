// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.projectfluent.language.psi_node.*;

public interface WitTypes {

  IElementType ATTRIBUTE_ID = new WitElementType("ATTRIBUTE_ID");
  IElementType BLOCK_PLACEABLE = new WitElementType("BLOCK_PLACEABLE");
  IElementType BLOCK_TEXT = new WitElementType("BLOCK_TEXT");
  IElementType ENUM = new WitElementType("ENUM");
  IElementType EXPORT = new WitElementType("EXPORT");
  IElementType FLAGS = new WitElementType("FLAGS");
  IElementType FUNCTION = new WitElementType("FUNCTION");
  IElementType FUNCTION_SIGNATURE = new WitElementType("FUNCTION_SIGNATURE");
  IElementType GENERIC = new WitElementType("GENERIC");
  IElementType IDENTIFIER = new WitElementType("IDENTIFIER");
  IElementType IMPORT = new WitElementType("IMPORT");
  IElementType INCLUDE = new WitElementType("INCLUDE");
  IElementType INCLUDE_NAME = new WitElementType("INCLUDE_NAME");
  IElementType INLINE_PLACEABLE = new WitElementType("INLINE_PLACEABLE");
  IElementType INLINE_TEXT = new WitElementType("INLINE_TEXT");
  IElementType INTERFACE = new WitElementType("INTERFACE");
  IElementType INTERFACE_NAME = new WitElementType("INTERFACE_NAME");
  IElementType MODULE_NAME = new WitElementType("MODULE_NAME");
  IElementType NUMBER_LITERAL = new WitElementType("NUMBER_LITERAL");
  IElementType ORGANIZATION_NAME = new WitElementType("ORGANIZATION_NAME");
  IElementType PACKAGE = new WitElementType("PACKAGE");
  IElementType PACKAGE_NAME = new WitElementType("PACKAGE_NAME");
  IElementType PARAMETER = new WitElementType("PARAMETER");
  IElementType RECORD = new WitElementType("RECORD");
  IElementType RECORD_FIELD = new WitElementType("RECORD_FIELD");
  IElementType RESOURCE = new WitElementType("RESOURCE");
  IElementType SEMANTIC_NUMBER = new WitElementType("SEMANTIC_NUMBER");
  IElementType STRING_LITERAL = new WitElementType("STRING_LITERAL");
  IElementType TYPE = new WitElementType("TYPE");
  IElementType TYPE_HINT = new WitElementType("TYPE_HINT");
  IElementType USE = new WitElementType("USE");
  IElementType USE_ITEMS = new WitElementType("USE_ITEMS");
  IElementType VARIABLE_ID = new WitElementType("VARIABLE_ID");
  IElementType VARIANT = new WitElementType("VARIANT");
  IElementType VARIANT_ITEM = new WitElementType("VARIANT_ITEM");
  IElementType WORLD = new WitElementType("WORLD");

  IElementType ACCENT = new WitTokenType("^");
  IElementType ANGLE_L = new WitTokenType("<");
  IElementType ANGLE_R = new WitTokenType(">");
  IElementType AT = new WitTokenType("@");
  IElementType BLANK_BLOCK = new WitTokenType("BLANK_BLOCK");
  IElementType BRACE_L = new WitTokenType("{");
  IElementType BRACE_R = new WitTokenType("}");
  IElementType BRACKET_L = new WitTokenType("[");
  IElementType BRACKET_R = new WitTokenType("]");
  IElementType COLON = new WitTokenType(":");
  IElementType COMMA = new WitTokenType(",");
  IElementType COMMENT = new WitTokenType("Comment");
  IElementType COMMENT_BLOCK = new WitTokenType("Comment Block");
  IElementType COMMENT_DOCUMENT = new WitTokenType("Comment Document");
  IElementType COMMENT_LINE = new WitTokenType("COMMENT_LINE");
  IElementType DECIMAL = new WitTokenType("DECIMAL");
  IElementType DOLLAR = new WitTokenType("$");
  IElementType DOT = new WitTokenType(".");
  IElementType EQ = new WitTokenType("=");
  IElementType HYPHEN = new WitTokenType("-");
  IElementType INTEGER = new WitTokenType("INTEGER");
  IElementType KW_ENUM = new WitTokenType("enum");
  IElementType KW_EXPORT = new WitTokenType("export");
  IElementType KW_FLAGS = new WitTokenType("flags");
  IElementType KW_FUNCTION = new WitTokenType("func");
  IElementType KW_IMPORT = new WitTokenType("import");
  IElementType KW_INCLUDE = new WitTokenType("include");
  IElementType KW_INTERFACE = new WitTokenType("interface");
  IElementType KW_PACKAGE = new WitTokenType("package");
  IElementType KW_RECORD = new WitTokenType("record");
  IElementType KW_RESOURCE = new WitTokenType("resource");
  IElementType KW_TYPE = new WitTokenType("type");
  IElementType KW_USE = new WitTokenType("use");
  IElementType KW_VARIANT = new WitTokenType("variant");
  IElementType KW_WORLD = new WitTokenType("world");
  IElementType PARENTHESIS_L = new WitTokenType("(");
  IElementType PARENTHESIS_R = new WitTokenType(")");
  IElementType PLACE_HOLDER = new WitTokenType("_");
  IElementType SELECTION_LINE = new WitTokenType("SELECTION_LINE");
  IElementType SEMICOLON = new WitTokenType(";");
  IElementType SLASH = new WitTokenType("/");
  IElementType STAR = new WitTokenType("*");
  IElementType STRING_CHAR = new WitTokenType("String Character");
  IElementType STRING_ESCAPE = new WitTokenType("String Escaped");
  IElementType STRING_QUOTE = new WitTokenType("String Quote");
  IElementType SYMBOL = new WitTokenType("Symbol");
  IElementType TEXT_LINE = new WitTokenType("TEXT_LINE");
  IElementType TO = new WitTokenType("->");
  IElementType URL = new WitTokenType("Url");
  IElementType VERSION = new WitTokenType("<<semver>>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATTRIBUTE_ID) {
        return new WitAttributeIDNode(node);
      }
      else if (type == BLOCK_PLACEABLE) {
        return new WitBlockPlaceableNode(node);
      }
      else if (type == BLOCK_TEXT) {
        return new WitBlockTextNode(node);
      }
      else if (type == ENUM) {
        return new WitEnumNode(node);
      }
      else if (type == EXPORT) {
        return new WitExportNode(node);
      }
      else if (type == FLAGS) {
        return new WitFlagsNode(node);
      }
      else if (type == FUNCTION) {
        return new WitFunctionNode(node);
      }
      else if (type == FUNCTION_SIGNATURE) {
        return new WitFunctionSignatureNode(node);
      }
      else if (type == GENERIC) {
        return new WitGenericNode(node);
      }
      else if (type == IDENTIFIER) {
        return new WitIdentifierNode(node);
      }
      else if (type == IMPORT) {
        return new WitImportNode(node);
      }
      else if (type == INCLUDE) {
        return new WitIncludeNode(node);
      }
      else if (type == INCLUDE_NAME) {
        return new WitIncludeNameNode(node);
      }
      else if (type == INLINE_PLACEABLE) {
        return new WitInlinePlaceableNode(node);
      }
      else if (type == INLINE_TEXT) {
        return new WitInlineTextNode(node);
      }
      else if (type == INTERFACE) {
        return new WitInterfaceNode(node);
      }
      else if (type == INTERFACE_NAME) {
        return new WitInterfaceNameNode(node);
      }
      else if (type == MODULE_NAME) {
        return new WitModuleNameNode(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new WitNumberLiteralNode(node);
      }
      else if (type == ORGANIZATION_NAME) {
        return new WitOrganizationNameNode(node);
      }
      else if (type == PACKAGE) {
        return new WitPackageNode(node);
      }
      else if (type == PACKAGE_NAME) {
        return new WitPackageNameNode(node);
      }
      else if (type == PARAMETER) {
        return new WitParameterNode(node);
      }
      else if (type == RECORD) {
        return new WitRecordNode(node);
      }
      else if (type == RECORD_FIELD) {
        return new WitRecordFieldNode(node);
      }
      else if (type == RESOURCE) {
        return new WitResourceNode(node);
      }
      else if (type == SEMANTIC_NUMBER) {
        return new WitSemanticNumberNode(node);
      }
      else if (type == STRING_LITERAL) {
        return new WitStringLiteralNode(node);
      }
      else if (type == TYPE) {
        return new WitTypeNode(node);
      }
      else if (type == TYPE_HINT) {
        return new WitTypeHintNode(node);
      }
      else if (type == USE) {
        return new WitUseNode(node);
      }
      else if (type == USE_ITEMS) {
        return new WitUseItemsNode(node);
      }
      else if (type == VARIABLE_ID) {
        return new WitVariableIDNode(node);
      }
      else if (type == VARIANT) {
        return new WitVariantNode(node);
      }
      else if (type == VARIANT_ITEM) {
        return new WitVariantItemNode(node);
      }
      else if (type == WORLD) {
        return new WitWorldNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
