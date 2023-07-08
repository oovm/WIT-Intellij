// This is a generated file. Not intended for manual editing.
package com.github.projectfluent.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.projectfluent.language.psi.WitTypes.*;
import com.github.projectfluent.language.mixin.MixinInterface;
import com.github.projectfluent.language.psi.*;

public class WitInterfaceNode extends MixinInterface implements WitInterface {

  public WitInterfaceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitVisitor visitor) {
    visitor.visitInterface(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitVisitor) accept((WitVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WitEnum> getEnumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitEnum.class);
  }

  @Override
  @NotNull
  public List<WitFlags> getFlagsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitFlags.class);
  }

  @Override
  @NotNull
  public List<WitFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitFunction.class);
  }

  @Override
  @Nullable
  public WitInterfaceName getInterfaceName() {
    return findChildByClass(WitInterfaceName.class);
  }

  @Override
  @NotNull
  public List<WitRecord> getRecordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitRecord.class);
  }

  @Override
  @NotNull
  public List<WitResource> getResourceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitResource.class);
  }

  @Override
  @NotNull
  public List<WitType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitType.class);
  }

  @Override
  @NotNull
  public List<WitUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitUse.class);
  }

  @Override
  @NotNull
  public List<WitVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitVariant.class);
  }

}
