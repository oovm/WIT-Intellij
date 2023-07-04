// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FluentArgument extends PsiElement {

  @Nullable
  FluentInlinePlaceable getInlinePlaceable();

  @Nullable
  FluentNamedArgument getNamedArgument();

  @Nullable
  FluentNumberLiteral getNumberLiteral();

  @Nullable
  FluentStringLiteral getStringLiteral();

  @Nullable
  FluentVariableID getVariableID();

  @Nullable
  FluentRecord getRecord();

  @Nullable
  FluentRecordField getRecordField();

  @Nullable
  FluentResource getResource();

}
