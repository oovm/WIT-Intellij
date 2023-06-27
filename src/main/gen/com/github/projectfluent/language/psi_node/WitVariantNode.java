// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.github.projectfluent.language.psi.WitElement;
import com.github.projectfluent.language.psi.*;

public class WitVariantNode extends WitElement implements FluentVariant {

  public WitVariantNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitVariant(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FluentVisitor) accept((FluentVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FluentPattern getPattern() {
    return findNotNullChildByClass(FluentPattern.class);
  }

  @Override
  @NotNull
  public FluentVariantKey getVariantKey() {
    return findNotNullChildByClass(FluentVariantKey.class);
  }

}
