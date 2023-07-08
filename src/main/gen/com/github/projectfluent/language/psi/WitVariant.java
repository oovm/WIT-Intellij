// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitVariant extends PsiElement {

  @Nullable
  WitIdentifier getIdentifier();

  @NotNull
  List<WitVariantItem> getVariantItemList();

}
