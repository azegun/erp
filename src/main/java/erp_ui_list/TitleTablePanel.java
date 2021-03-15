package erp_ui_list;

import javax.swing.SwingConstants;

import erp_dto.Title;
import erp_ui_service.TitleService;

@SuppressWarnings("serial")
public class TitleTablePanel extends AbstractCustomTablePanel<Title> {
	private TitleService service;
	
	@Override
	public String[] getColumnNames() {
		return new String[] {"직책번호", "직책명"};
	}

	@Override
	protected void setAlignAndWidth() {
		
		//컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1);
		
		//컬럼별 너비 조정
		setTableCellWidth(100, 250);
	}

	@Override
	protected Object[] toArray(Title t) {
		return new Object[] {t.gettNo(),t.gettName()};
	}

	@Override
	public void initList() {
		list = service.showTitles();
	}

	public void setService(TitleService service) {
		this.service = service;
	}
	


}