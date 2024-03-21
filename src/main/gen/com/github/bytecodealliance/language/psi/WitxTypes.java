// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.bytecodealliance.language.psi_node.*;

public interface WitxTypes {

  IElementType ALIAS_NAME = new WitElementType("ALIAS_NAME");
  IElementType CONSTRUCTOR = new WitElementType("CONSTRUCTOR");
  IElementType ENUM = new WitElementType("ENUM");
  IElementType EXPORT = new WitElementType("EXPORT");
  IElementType FLAGS = new WitElementType("FLAGS");
  IElementType FUNCTION = new WitElementType("FUNCTION");
  IElementType FUNCTION_PARAMETERS = new WitElementType("FUNCTION_PARAMETERS");
  IElementType FUNCTION_SIGNATURE = new WitElementType("FUNCTION_SIGNATURE");
  IElementType GENERIC = new WitElementType("GENERIC");
  IElementType IDENTIFIER = new WitElementType("IDENTIFIER");
  IElementType IMPORT = new WitElementType("IMPORT");
  IElementType INCLUDE = new WitElementType("INCLUDE");
  IElementType INCLUDE_NAME = new WitElementType("INCLUDE_NAME");
  IElementType INTERFACE = new WitElementType("INTERFACE");
  IElementType INTERFACE_NAME = new WitElementType("INTERFACE_NAME");
  IElementType METHOD = new WitElementType("METHOD");
  IElementType MODULE_NAME = new WitElementType("MODULE_NAME");
  IElementType ORGANIZATION_NAME = new WitElementType("ORGANIZATION_NAME");
  IElementType PACKAGE = new WitElementType("PACKAGE");
  IElementType PACKAGE_NAME = new WitElementType("PACKAGE_NAME");
  IElementType PARAMETER = new WitElementType("PARAMETER");
  IElementType RECORD = new WitElementType("RECORD");
  IElementType RECORD_FIELD = new WitElementType("RECORD_FIELD");
  IElementType RESOURCE = new WitElementType("RESOURCE");
  IElementType SEMANTIC_NUMBER = new WitElementType("SEMANTIC_NUMBER");
  IElementType TYPENAME = new WitElementType("TYPENAME");
  IElementType TYPE_HINT = new WitElementType("TYPE_HINT");
  IElementType USE = new WitElementType("USE");
  IElementType USE_ALIAS = new WitElementType("USE_ALIAS");
  IElementType USE_ITEMS = new WitElementType("USE_ITEMS");
  IElementType VARIANT = new WitElementType("VARIANT");
  IElementType VARIANT_ITEM = new WitElementType("VARIANT_ITEM");
  IElementType WORLD = new WitElementType("WORLD");

  IElementType ACCENT = new WitxTokenType("^");
  IElementType ANGLE_L = new WitxTokenType("<");
  IElementType ANGLE_R = new WitxTokenType(">");
  IElementType AT = new WitxTokenType("@");
  IElementType BRACE_L = new WitxTokenType("{");
  IElementType BRACE_R = new WitxTokenType("}");
  IElementType BRACKET_L = new WitxTokenType("[");
  IElementType BRACKET_R = new WitxTokenType("]");
  IElementType COLON = new WitxTokenType(":");
  IElementType COMMA = new WitxTokenType(",");
  IElementType COMMENT = new WitxTokenType("Comment");
  IElementType COMMENT_BLOCK = new WitxTokenType("Comment Block");
  IElementType COMMENT_DOCUMENT = new WitxTokenType("Comment Document");
  IElementType COMMENT_LINE = new WitxTokenType("COMMENT_LINE");
  IElementType DOLLAR = new WitxTokenType("$");
  IElementType DOT = new WitxTokenType(".");
  IElementType EQ = new WitxTokenType("=");
  IElementType ESCAPED = new WitxTokenType("ESCAPED");
  IElementType HYPHEN = new WitxTokenType("-");
  IElementType KW_AS = new WitxTokenType("as");
  IElementType KW_CONSTRUCTOR = new WitxTokenType("constructor");
  IElementType KW_ENUM = new WitxTokenType("enum");
  IElementType KW_EXPORT = new WitxTokenType("export");
  IElementType KW_FLAGS = new WitxTokenType("flags");
  IElementType KW_FUNCTION = new WitxTokenType("func");
  IElementType KW_IMPORT = new WitxTokenType("import");
  IElementType KW_INCLUDE = new WitxTokenType("include");
  IElementType KW_INTERFACE = new WitxTokenType("interface");
  IElementType KW_PACKAGE = new WitxTokenType("package");
  IElementType KW_RECORD = new WitxTokenType("record");
  IElementType KW_RESOURCE = new WitxTokenType("resource");
  IElementType KW_TYPE = new WitxTokenType("type");
  IElementType KW_USE = new WitxTokenType("use");
  IElementType KW_VARIANT = new WitxTokenType("variant");
  IElementType KW_WORLD = new WitxTokenType("world");
  IElementType PARENTHESIS_L = new WitxTokenType("(");
  IElementType PARENTHESIS_R = new WitxTokenType(")");
  IElementType PLACE_HOLDER = new WitxTokenType("_");
  IElementType SELECTION_LINE = new WitxTokenType("SELECTION_LINE");
  IElementType SEMICOLON = new WitxTokenType(";");
  IElementType SLASH = new WitxTokenType("/");
  IElementType STAR = new WitxTokenType("*");
  IElementType STRING_CHAR = new WitxTokenType("String Character");
  IElementType STRING_ESCAPE = new WitxTokenType("String Escaped");
  IElementType STRING_QUOTE = new WitxTokenType("String Quote");
  IElementType SYMBOL = new WitxTokenType("Symbol");
  IElementType TO = new WitxTokenType("->");
  IElementType URL = new WitxTokenType("Url");
  IElementType VERSION = new WitxTokenType("<<semver>>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_NAME) {
        return new WitxAliasNameNode(node);
      }
      else if (type == CONSTRUCTOR) {
        return new WitxConstructorNode(node);
      }
      else if (type == ENUM) {
        return new WitxEnumNode(node);
      }
      else if (type == EXPORT) {
        return new WitxExportNode(node);
      }
      else if (type == FLAGS) {
        return new WitxFlagsNode(node);
      }
      else if (type == FUNCTION) {
        return new WitxFunctionNode(node);
      }
      else if (type == FUNCTION_PARAMETERS) {
        return new WitxFunctionParametersNode(node);
      }
      else if (type == FUNCTION_SIGNATURE) {
        return new WitxFunctionSignatureNode(node);
      }
      else if (type == GENERIC) {
        return new WitxGenericNode(node);
      }
      else if (type == IDENTIFIER) {
        return new WitxIdentifierNode(node);
      }
      else if (type == IMPORT) {
        return new WitxImportNode(node);
      }
      else if (type == INCLUDE) {
        return new WitxIncludeNode(node);
      }
      else if (type == INCLUDE_NAME) {
        return new WitxIncludeNameNode(node);
      }
      else if (type == INTERFACE) {
        return new WitxInterfaceNode(node);
      }
      else if (type == INTERFACE_NAME) {
        return new WitxInterfaceNameNode(node);
      }
      else if (type == METHOD) {
        return new WitxMethodNode(node);
      }
      else if (type == MODULE_NAME) {
        return new WitxModuleNameNode(node);
      }
      else if (type == ORGANIZATION_NAME) {
        return new WitxOrganizationNameNode(node);
      }
      else if (type == PACKAGE) {
        return new WitxPackageNode(node);
      }
      else if (type == PACKAGE_NAME) {
        return new WitxPackageNameNode(node);
      }
      else if (type == PARAMETER) {
        return new WitxParameterNode(node);
      }
      else if (type == RECORD) {
        return new WitxRecordNode(node);
      }
      else if (type == RECORD_FIELD) {
        return new WitxRecordFieldNode(node);
      }
      else if (type == RESOURCE) {
        return new WitxResourceNode(node);
      }
      else if (type == SEMANTIC_NUMBER) {
        return new WitxSemanticNumberNode(node);
      }
      else if (type == TYPENAME) {
        return new WitxTypenameNode(node);
      }
      else if (type == TYPE_HINT) {
        return new WitxTypeHintNode(node);
      }
      else if (type == USE) {
        return new WitxUseNode(node);
      }
      else if (type == USE_ALIAS) {
        return new WitxUseAliasNode(node);
      }
      else if (type == USE_ITEMS) {
        return new WitxUseItemsNode(node);
      }
      else if (type == VARIANT) {
        return new WitxVariantNode(node);
      }
      else if (type == VARIANT_ITEM) {
        return new WitxVariantItemNode(node);
      }
      else if (type == WORLD) {
        return new WitxWorldNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
