package application.viewModel;

import application.Store;
import application.model.DiagramElement;
import application.model.Iterator;
import application.model.StateDiagram;

/**
 * Created by ucfan on 2017/4/3.
 */
public class StateDiagramViewModel extends ViewModel<StateDiagram> {
    public StateDiagramViewModel(StateDiagram model) {
        super(model);
    }

    @Override
    public void draw(Store store) {
        Iterator<DiagramElement> iter = model.iterator();

        while (iter.hasNext()) {
            DiagramElement element = iter.next();
            element.draw(store);
        }
    }
}
