// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.bytecodealliance.language.psi_node.*;

public interface WitxTypes {

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
  IElementType METHOD = new WitxElementType("METHOD");
  IElementType PACKAGE = new WitxElementType("PACKAGE");
  IElementType PACKAGE_NAME = new WitxElementType("PACKAGE_NAME");
  IElementType PARAMETER = new WitxElementType("PARAMETER");
  IElementType RECORD = new WitxElementType("RECORD");
  IElementType RECORD_FIELD = new WitxElementType("RECORD_FIELD");
  IElementType REFERENCE_NAME = new WitxElementType("REFERENCE_NAME");
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

  IElementType ACCENT = new WitTokenType("^");
  IElementType ALIAS_NAME = new WitTokenType("alias-name");
  IElementType ANGLE_L = new WitTokenType("<");
  IElementType ANGLE_R = new WitTokenType(">");
  IElementType AT = new WitTokenType("@");
  IElementType BRACE_L = new WitTokenType("{");
  IElementType BRACE_R = new WitTokenType("}");
  IElementType BRACKET_L = new WitTokenType("[");
  IElementType BRACKET_R = new WitTokenType("]");
  IElementType COLON = new WitTokenType(":");
  IElementType COMMA = new WitTokenType(",");
  IElementType COMMENT_BLOCK = new WitTokenType("Comment Block");
  IElementType COMMENT_DOCUMENT = new WitTokenType("Comment Document");
  IElementType COMMENT_LINE = new WitTokenType("Comment Line");
  IElementType DOLLAR = new WitTokenType("$");
  IElementType DOT = new WitTokenType(".");
  IElementType EQ = new WitTokenType("=");
  IElementType ESCAPED = new WitTokenType("ESCAPED");
  IElementType HYPHEN = new WitTokenType("-");
  IElementType INTERFACE_NAME = new WitTokenType("interface-name");
  IElementType KW_AS = new WitTokenType("as");
  IElementType KW_CONSTRUCTOR = new WitTokenType("constructor");
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
  IElementType MODULE_NAME = new WitTokenType("module-name");
  IElementType ORGANIZATION_NAME = new WitTokenType("organization-name");
  IElementType PARENTHESIS_L = new WitTokenType("(");
  IElementType PARENTHESIS_R = new WitTokenType(")");
  IElementType PLACE_HOLDER = new WitTokenType("_");
  IElementType REFERENCE = new WitTokenType("$Symbol");
  IElementType SELECTION_LINE = new WitTokenType("SELECTION_LINE");
  IElementType SEMICOLON = new WitTokenType(";");
  IElementType SLASH = new WitTokenType("/");
  IElementType STAR = new WitTokenType("*");
  IElementType STRING_CHAR = new WitTokenType("String Character");
  IElementType STRING_ESCAPE = new WitTokenType("String Escaped");
  IElementType STRING_QUOTE = new WitTokenType("String Quote");
  IElementType SYMBOL = new WitTokenType("Symbol");
  IElementType TO = new WitTokenType("->");
  IElementType URL = new WitTokenType("Url");
  IElementType VERSION = new WitTokenType("<<semver>>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONSTRUCTOR) {
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
      else if (type == METHOD) {
        return new WitxMethodNode(node);
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
      else if (type == REFERENCE_NAME) {
        return new WitxReferenceNameNode(node);
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
