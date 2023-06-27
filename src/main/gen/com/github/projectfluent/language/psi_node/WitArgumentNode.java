// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.github.projectfluent.language.psi.WitElement;
import com.github.projectfluent.language.psi.*;

public class WitArgumentNode extends WitElement implements FluentArgument {

  public WitArgumentNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitArgument(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FluentVisitor) accept((FluentVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FluentFunctionReference getFunctionReference() {
    return findChildByClass(FluentFunctionReference.class);
  }

  @Override
  @Nullable
  public FluentInlinePlaceable getInlinePlaceable() {
    return findChildByClass(FluentInlinePlaceable.class);
  }

  @Override
  @Nullable
  public FluentMessageReference getMessageReference() {
    return findChildByClass(FluentMessageReference.class);
  }

  @Override
  @Nullable
  public FluentNamedArgument getNamedArgument() {
    return findChildByClass(FluentNamedArgument.class);
  }

  @Override
  @Nullable
  public FluentNumberLiteral getNumberLiteral() {
    return findChildByClass(FluentNumberLiteral.class);
  }

  @Override
  @Nullable
  public FluentStringLiteral getStringLiteral() {
    return findChildByClass(FluentStringLiteral.class);
  }

  @Override
  @Nullable
  public FluentTermReference getTermReference() {
    return findChildByClass(FluentTermReference.class);
  }

  @Override
  @Nullable
  public FluentVariableID getVariableID() {
    return findChildByClass(FluentVariableID.class);
  }

}
