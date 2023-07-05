// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.projectfluent.language.psi.FluentTypes.*;
import com.github.projectfluent.language.psi.WitElement;
import com.github.projectfluent.language.psi.*;

public class FluentFunctionSignatureNode extends WitElement implements FluentFunctionSignature {

  public FluentFunctionSignatureNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitFunctionSignature(this);
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
  public List<FluentParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FluentParameter.class);
  }

  @Override
  @Nullable
  public FluentTypeHint getTypeHint() {
    return findChildByClass(FluentTypeHint.class);
  }

}
