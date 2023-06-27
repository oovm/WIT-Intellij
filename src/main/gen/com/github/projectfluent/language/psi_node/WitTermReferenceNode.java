// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.github.projectfluent.language.psi.WitElement;
import com.github.projectfluent.language.psi.*;

public class WitTermReferenceNode extends WitElement implements FluentTermReference {

  public WitTermReferenceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitTermReference(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FluentVisitor) accept((FluentVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FluentCallArguments getCallArguments() {
    return findChildByClass(FluentCallArguments.class);
  }

  @Override
  @NotNull
  public FluentTermID getTermID() {
    return findNotNullChildByClass(FluentTermID.class);
  }

}
