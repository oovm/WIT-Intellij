// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitxResource extends PsiElement {

  @NotNull
  List<WitxConstructor> getConstructorList();

  @Nullable
  WitxIdentifier getIdentifier();

  @NotNull
  List<WitxMethod> getMethodList();

}
