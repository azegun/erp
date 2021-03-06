package erp;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import erp_ui.DepartmentManagerUi;
import erp_ui.EmployeeManagerUi;
import erp_ui.TitleManagerUi;

public class Main extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton	btnTitle;
	private JButton btnDepartment;
	private JButton btnEmployee;
	private TitleManagerUi titleframe;
	private DepartmentManagerUi deptframe;
	private EmployeeManagerUi empframe;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {
		
		createFrame();
		
		
		initialize();
	}


	public void createFrame() {
		titleframe = new TitleManagerUi();
		titleframe.setTitle("직책관리");
		
		deptframe = new DepartmentManagerUi();
		deptframe.setTitle("부서관리");
		
		empframe = new EmployeeManagerUi();
		empframe.setTitle("직원관리");
	}
	private void initialize() {
		setTitle("erp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnTitle = new JButton("직책관리");
		btnTitle.addActionListener(this);
		contentPane.add(btnTitle);
		
		btnDepartment = new JButton("부서관리");
		btnDepartment.addActionListener(this);
		contentPane.add(btnDepartment);
		
		btnEmployee = new JButton("사원관리");
		btnEmployee.addActionListener(this);
		contentPane.add(btnEmployee);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEmployee) {
			actionPerformedBtnEmployee(e);
		}
		if (e.getSource() == btnDepartment) {
			actionPerformedBtnDepartment(e);
		}
		if (e.getSource() == btnTitle) {
			actionPerformedBtnTitle(e);
		}
	}
	protected void actionPerformedBtnTitle(ActionEvent e) {		
		titleframe.setVisible(true);
	}
	protected void actionPerformedBtnDepartment(ActionEvent e) {		
		deptframe.setVisible(true);
	}
	protected void actionPerformedBtnEmployee(ActionEvent e) {		
		empframe.setVisible(true);
	}
}
