// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.projectfluent.language.psi.WitTypes.*;
import com.github.projectfluent.language.psi.WitElement;
import com.github.projectfluent.language.psi.*;

public class WitInlinePlaceableNode extends WitElement implements WitInlinePlaceable {

  public WitInlinePlaceableNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitVisitor visitor) {
    visitor.visitInlinePlaceable(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitVisitor) accept((WitVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WitInlinePlaceable getInlinePlaceable() {
    return findChildByClass(WitInlinePlaceable.class);
  }

  @Override
  @Nullable
  public WitNumberLiteral getNumberLiteral() {
    return findChildByClass(WitNumberLiteral.class);
  }

  @Override
  @Nullable
  public WitStringLiteral getStringLiteral() {
    return findChildByClass(WitStringLiteral.class);
  }

  @Override
  @Nullable
  public WitVariableID getVariableID() {
    return findChildByClass(WitVariableID.class);
  }

  @Override
  @Nullable
  public WitImport getImport() {
    return findChildByClass(WitImport.class);
  }

  @Override
  @Nullable
  public WitRecord getRecord() {
    return findChildByClass(WitRecord.class);
  }

  @Override
  @Nullable
  public WitRecordField getRecordField() {
    return findChildByClass(WitRecordField.class);
  }

  @Override
  @Nullable
  public WitResource getResource() {
    return findChildByClass(WitResource.class);
  }

}
