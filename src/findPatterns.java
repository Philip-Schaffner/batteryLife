import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.Project;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiJavaParserFacade;

/**
 * Created by pip on 25.11.2015.
 */
public class findPatterns extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        Project project = e.getData(PlatformDataKeys.PROJECT);

        try {
            Document d = e.getData(PlatformDataKeys.EDITOR).getDocument();
            System.out.println(d);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            Document d = e.getData(PlatformDataKeys.EDITOR).getDocument();
            PsiFile psi = PsiDocumentManager.getInstance(project).getPsiFile(d);
            System.out.println(psi);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        JavaPsiFacade psif =
    }
}
