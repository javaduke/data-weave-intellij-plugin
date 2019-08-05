// This is a generated file. Not intended for manual editing.
package org.mule.tooling.lang.dw.parser.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.mule.tooling.lang.dw.parser.psi.WeaveKeyValuePair;
import org.mule.tooling.lang.dw.parser.psi.WeaveMultipleKeyValuePairObj;
import org.mule.tooling.lang.dw.parser.psi.WeaveVisitor;

import java.util.List;

public class WeaveMultipleKeyValuePairObjImpl extends ASTWrapperPsiElement implements WeaveMultipleKeyValuePairObj {

  public WeaveMultipleKeyValuePairObjImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WeaveVisitor visitor) {
    visitor.visitMultipleKeyValuePairObj(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WeaveVisitor) accept((WeaveVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WeaveKeyValuePair> getKeyValuePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WeaveKeyValuePair.class);
  }

}