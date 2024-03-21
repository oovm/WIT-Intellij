// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WitxTypes.*;
import com.github.bytecodealliance.language.psi.WitElement;
import com.github.bytecodealliance.language.psi.*;

public class WitxInterfaceNode extends WitElement implements WitxInterface {

  public WitxInterfaceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitxVisitor visitor) {
    visitor.visitInterface(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitxVisitor) accept((WitxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WitxEnum> getEnumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxEnum.class);
  }

  @Override
  @NotNull
  public List<WitxFlags> getFlagsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxFlags.class);
  }

  @Override
  @NotNull
  public List<WitxFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxFunction.class);
  }

  @Override
  @NotNull
  public List<WitxRecord> getRecordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxRecord.class);
  }

  @Override
  @NotNull
  public List<WitxResource> getResourceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxResource.class);
  }

  @Override
  @NotNull
  public List<WitxTypename> getTypenameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxTypename.class);
  }

  @Override
  @NotNull
  public List<WitxUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxUse.class);
  }

  @Override
  @NotNull
  public List<WitxVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxVariant.class);
  }

}
