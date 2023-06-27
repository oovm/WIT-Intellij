// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.github.projectfluent.language.psi.WitElement;
import com.github.projectfluent.language.psi.*;

public class WitFunctionReferenceNode extends WitElement implements FluentFunctionReference {

  public WitFunctionReferenceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitFunctionReference(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FluentVisitor) accept((FluentVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FluentCallArguments getCallArguments() {
    return findNotNullChildByClass(FluentCallArguments.class);
  }

  @Override
  @NotNull
  public FluentFunctionID getFunctionID() {
    return findNotNullChildByClass(FluentFunctionID.class);
  }

}
