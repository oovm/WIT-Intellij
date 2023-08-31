// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitxInterface extends PsiElement {

  @NotNull
  List<WitxEnum> getEnumList();

  @NotNull
  List<WitxFlags> getFlagsList();

  @NotNull
  List<WitxFunction> getFunctionList();

  @NotNull
  List<WitxRecord> getRecordList();

  @NotNull
  List<WitxResource> getResourceList();

  @NotNull
  List<WitxTypename> getTypenameList();

  @NotNull
  List<WitxUse> getUseList();

  @NotNull
  List<WitxVariant> getVariantList();

}
