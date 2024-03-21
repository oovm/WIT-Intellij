// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.bytecodealliance.language.psi_node.*;

public interface WitxTypes {

  IElementType ALIAS_NAME = new WitxElementType("ALIAS_NAME");
  IElementType CONSTRUCTOR = new WitxElementType("CONSTRUCTOR");
  IElementType ENUM = new WitxElementType("ENUM");
  IElementType EXPORT = new WitxElementType("EXPORT");
  IElementType FLAGS = new WitxElementType("FLAGS");
  IElementType FUNCTION = new WitxElementType("FUNCTION");
  IElementType FUNCTION_PARAMETERS = new WitxElementType("FUNCTION_PARAMETERS");
  IElementType FUNCTION_SIGNATURE = new WitxElementType("FUNCTION_SIGNATURE");
  IElementType GENERIC = new WitxElementType("GENERIC");
  IElementType IDENTIFIER = new WitxElementType("IDENTIFIER");
  IElementType IMPORT = new WitxElementType("IMPORT");
  IElementType INCLUDE = new WitxElementType("INCLUDE");
  IElementType INCLUDE_NAME = new WitxElementType("INCLUDE_NAME");
  IElementType INTERFACE = new WitxElementType("INTERFACE");
  IElementType INTERFACE_NAME = new WitxElementType("INTERFACE_NAME");
  IElementType METHOD = new WitxElementType("METHOD");
  IElementType MODULE_NAME = new WitxElementType("MODULE_NAME");
  IElementType ORGANIZATION_NAME = new WitxElementType("ORGANIZATION_NAME");
  IElementType PACKAGE = new WitxElementType("PACKAGE");
  IElementType PACKAGE_NAME = new WitxElementType("PACKAGE_NAME");
  IElementType PARAMETER = new WitxElementType("PARAMETER");
  IElementType RECORD = new WitxElementType("RECORD");
  IElementType RECORD_FIELD = new WitxElementType("RECORD_FIELD");
  IElementType RESOURCE = new WitxElementType("RESOURCE");
  IElementType SEMANTIC_NUMBER = new WitxElementType("SEMANTIC_NUMBER");
  IElementType TYPENAME = new WitxElementType("TYPENAME");
  IElementType TYPE_HINT = new WitxElementType("TYPE_HINT");
  IElementType USE = new WitxElementType("USE");
  IElementType USE_ALIAS = new WitxElementType("USE_ALIAS");
  IElementType USE_ITEMS = new WitxElementType("USE_ITEMS");
  IElementType VARIANT = new WitxElementType("VARIANT");
  IElementType VARIANT_ITEM = new WitxElementType("VARIANT_ITEM");
  IElementType WORLD = new WitxElementType("WORLD");

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
  IElementType COMMENT_LINE = new WitxTokenType("Comment Line");
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
