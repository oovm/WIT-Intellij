// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitWorld extends PsiElement {

  @NotNull
  List<WitExport> getExportList();

  @Nullable
  WitIdentifier getIdentifier();

  @NotNull
  List<WitImport> getImportList();

  @NotNull
  List<WitInclude> getIncludeList();

  @Nullable
  WitModifier getModifier();

  @NotNull
  List<WitRecord> getRecordList();

  @NotNull
  List<WitUse> getUseList();

  @NotNull
  List<WitVariant> getVariantList();

}
