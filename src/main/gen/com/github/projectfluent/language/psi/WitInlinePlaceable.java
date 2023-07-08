// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitInlinePlaceable extends PsiElement {

  @Nullable
  WitInlinePlaceable getInlinePlaceable();

  @Nullable
  WitNumberLiteral getNumberLiteral();

  @Nullable
  WitStringLiteral getStringLiteral();

  @Nullable
  WitVariableID getVariableID();

  @Nullable
  WitImport getImport();

  @Nullable
  WitRecord getRecord();

  @Nullable
  WitRecordField getRecordField();

  @Nullable
  WitResource getResource();

}
