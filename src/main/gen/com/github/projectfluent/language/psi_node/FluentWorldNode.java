// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.projectfluent.language.psi.FluentTypes.*;
import com.github.projectfluent.language.mixin.MixinWorld;
import com.github.projectfluent.language.psi.*;

public class FluentWorldNode extends MixinWorld implements FluentWorld {

  public FluentWorldNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitWorld(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FluentVisitor) accept((FluentVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FluentIdentifier getIdentifier() {
    return findChildByClass(FluentIdentifier.class);
  }

  @Override
  @NotNull
  public List<FluentInclude> getIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FluentInclude.class);
  }

}
