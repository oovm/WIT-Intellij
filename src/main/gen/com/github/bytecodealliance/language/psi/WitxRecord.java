// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitxRecord extends PsiElement {

  @Nullable
  WitxIdentifier getIdentifier();

  @NotNull
  List<WitxRecordField> getRecordFieldList();

}
