package br.ufam.ezrealtime.cde.editors.manifest;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.editors.text.templates.ContributionTemplateStore;

import br.ufam.edu.ezrealtime.cde.Activator;

final class ManifestTemplateProcessor extends TemplateCompletionProcessor {
	protected Template[] getTemplates(String contextTypeId) {
		ContributionTemplateStore templateStore = Activator.getDefault()
				.getTemplateStore();

		return templateStore.getTemplates();
	}

	protected Image getImage(Template template) {
		return Activator.getImage("template"); //$NON-NLS-1$
	}

	protected TemplateContextType getContextType(ITextViewer viewer,
			IRegion region) {
		return Activator.getDefault().getContextTypeRegistry().getContextType(
				Activator.RECIPE_TEMPLATE_CONTEXT);
	}
}