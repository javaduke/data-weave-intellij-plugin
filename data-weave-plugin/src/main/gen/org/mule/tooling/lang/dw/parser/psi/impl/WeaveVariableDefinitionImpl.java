// This is a generated file. Not intended for manual editing.
package org.mule.tooling.lang.dw.parser.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mule.tooling.lang.dw.parser.psi.*;

import java.util.List;

public class WeaveVariableDefinitionImpl extends WeaveVariableImpl implements WeaveVariableDefinition {

  public WeaveVariableDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WeaveVisitor visitor) {
    visitor.visitVariableDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WeaveVisitor) accept((WeaveVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WeaveAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WeaveAnnotation.class);
  }

  @Override
  @NotNull
  public WeaveExpression getExpression() {
    return findNotNullChildByClass(WeaveExpression.class);
  }

  @Override
  @NotNull
  public WeaveIdentifier getIdentifier() {
    return findNotNullChildByClass(WeaveIdentifier.class);
  }

  @Override
  @Nullable
  public WeaveType getType() {
    return findChildByClass(WeaveType.class);
  }

}
