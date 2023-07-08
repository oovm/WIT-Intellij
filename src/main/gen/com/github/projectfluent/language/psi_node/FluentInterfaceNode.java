// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.projectfluent.language.psi.FluentTypes.*;
import com.github.projectfluent.language.mixin.MixinInterface;
import com.github.projectfluent.language.psi.*;

public class FluentInterfaceNode extends MixinInterface implements FluentInterface {

  public FluentInterfaceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FluentVisitor visitor) {
    visitor.visitInterface(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FluentVisitor) accept((FluentVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FluentFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FluentFunction.class);
  }

  @Override
  @Nullable
  public FluentInterfaceName getInterfaceName() {
    return findChildByClass(FluentInterfaceName.class);
  }

  @Override
  @NotNull
  public List<FluentRecord> getRecordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FluentRecord.class);
  }

  @Override
  @NotNull
  public List<FluentResource> getResourceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FluentResource.class);
  }

  @Override
  @NotNull
  public List<FluentType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FluentType.class);
  }

  @Override
  @NotNull
  public List<FluentUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FluentUse.class);
  }

}
