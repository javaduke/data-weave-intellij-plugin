// This is a generated file. Not intended for manual editing.
package org.mule.tooling.lang.dw.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.mule.tooling.lang.dw.parser.psi.WeaveTypes.*;
import org.mule.tooling.lang.dw.parser.psi.*;

public class WeaveOutputDirectiveImpl extends WeaveDirectiveImpl implements WeaveOutputDirective {

  public WeaveOutputDirectiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull WeaveVisitor visitor) {
    visitor.visitOutputDirective(this);
  }

  @Override
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
  @Nullable
  public WeaveDataFormat getDataFormat() {
    return findChildByClass(WeaveDataFormat.class);
  }

  @Override
  @Nullable
  public WeaveIdentifier getIdentifier() {
    return findChildByClass(WeaveIdentifier.class);
  }

  @Override
  @Nullable
  public WeaveOptions getOptions() {
    return findChildByClass(WeaveOptions.class);
  }

  @Override
  @Nullable
  public WeaveType getType() {
    return findChildByClass(WeaveType.class);
  }

}
