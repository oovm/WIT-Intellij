// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitxTypename extends PsiElement {

  @Nullable
  WitxEnum getEnum();

  @Nullable
  WitxIdentifier getIdentifier();

  @Nullable
  WitxRecord getRecord();

  @Nullable
  WitxReferenceName getReferenceName();

}
