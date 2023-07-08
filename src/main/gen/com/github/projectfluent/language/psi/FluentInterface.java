// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FluentInterface extends PsiElement {

  @NotNull
  List<FluentFunction> getFunctionList();

  @Nullable
  FluentInterfaceName getInterfaceName();

  @NotNull
  List<FluentRecord> getRecordList();

  @NotNull
  List<FluentResource> getResourceList();

  @NotNull
  List<FluentType> getTypeList();

  @NotNull
  List<FluentUse> getUseList();

}
