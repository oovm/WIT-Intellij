// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WionTypes.*;
import com.github.bytecodealliance.language.psi.WionElement;
import com.github.bytecodealliance.language.psi.*;

public class WionExportTermNode extends WionElement implements WionExportTerm {

  public WionExportTermNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WionVisitor visitor) {
    visitor.visitExportTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WionVisitor) accept((WionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WionFunction getFunction() {
    return findChildByClass(WionFunction.class);
  }

  @Override
  @Nullable
  public WionIncludeName getIncludeName() {
    return findChildByClass(WionIncludeName.class);
  }

  @Override
  @Nullable
  public WionInlineInterface getInlineInterface() {
    return findChildByClass(WionInlineInterface.class);
  }

}
