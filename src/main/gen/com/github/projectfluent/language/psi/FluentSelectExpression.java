// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FluentSelectExpression extends PsiElement {

  @NotNull
  List<FluentDefaultVariant> getDefaultVariantList();

  @Nullable
  FluentInlinePlaceable getInlinePlaceable();

  @Nullable
  FluentNumberLiteral getNumberLiteral();

  @Nullable
  FluentStringLiteral getStringLiteral();

  @Nullable
  FluentVariableID getVariableID();

  @NotNull
  List<FluentVariant> getVariantList();

  @Nullable
  FluentRecord getRecord();

  @Nullable
  FluentRecordField getRecordField();

  @Nullable
  FluentResource getResource();

}
