// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WitxTypes.*;
import com.github.bytecodealliance.language.mixin.MixinResource;
import com.github.bytecodealliance.language.psi.*;

public class WitxResourceNode extends MixinResource implements WitxResource {

  public WitxResourceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitxVisitor visitor) {
    visitor.visitResource(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitxVisitor) accept((WitxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WitxConstructor> getConstructorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxConstructor.class);
  }

  @Override
  @Nullable
  public WitxIdentifier getIdentifier() {
    return findChildByClass(WitxIdentifier.class);
  }

  @Override
  @NotNull
  public List<WitxMethod> getMethodList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxMethod.class);
  }

}
