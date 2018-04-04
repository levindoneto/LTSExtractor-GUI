import exceptions.*;
import utils.*;
//import exceptions.UIException;

public class Button {
	private String idBtn;

	public Button(String idBtn) throws UIException {
		if (idBtn != null) {
			this.idBtn = idBtn;
		} else {
			throw new UIException(
                UIUtils.getText("exception.ui.invalidButtonId")
            );
		}
	}
}
