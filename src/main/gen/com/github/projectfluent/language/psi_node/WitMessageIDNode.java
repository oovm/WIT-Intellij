// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.github.projectfluent.language.psi.WitElement;
import com.github.projectfluent.language.psi.*;

public class WitMessageIDNode extends WitElement implements FluentMessageID {

  public WitMessageIDNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitMessageID(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FluentVisitor) accept((FluentVisitor)visitor);
    else super.accept(visitor);
  }

}
