// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitInterface extends PsiElement {

  @NotNull
  List<WitEnum> getEnumList();

  @NotNull
  List<WitFlags> getFlagsList();

  @NotNull
  List<WitFunction> getFunctionList();

  @Nullable
  WitInterfaceName getInterfaceName();

  @NotNull
  List<WitRecord> getRecordList();

  @NotNull
  List<WitResource> getResourceList();

  @NotNull
  List<WitType> getTypeList();

  @NotNull
  List<WitUse> getUseList();

  @NotNull
  List<WitVariant> getVariantList();

}
