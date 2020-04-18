package Composite.company.sub;

import java.util.ArrayList;

import Composite.company.Staff;

/**
 * 管理人员(手下有别的员工)
 * @author i
 *
 */
public class Manager extends Staff{
    /**
     * 存储手下员工信息 
     */
    private final ArrayList<Staff> arrayList = new ArrayList<Staff>();
    
    public Manager(String no, String name, String position, int salary) {
        super(no, name, position, salary);
    }
    
    /** 
     * 添加一个员工
     */
    @Override
    public void add(Staff staff) {
        this.arrayList.add(staff);
    }

    /** 
     * 删除一个员工
     */
    @Override
    public Staff remove(String no) {
        Staff staff = null;
        if (no != null && !"".equals(no.trim())) {
            for (int i = 0; i < this.arrayList.size(); i++) {
                // 可能考虑到当前下属已经离职了
                if (this.arrayList.get(i) == null) {
                    continue;
                }
                
                if (no.equals(this.arrayList.get(i).getNo())) {
                    staff = this.arrayList.remove(i);
                    break; 
                }
            }
        }
        return staff;
    }

    /**
     * 打印员工信息
     */
    @Override
    public void printEmployeesInfo(int layer) {
        int tmpLayer = ++layer;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) == null) {
                continue;
            }
            
            // 打印'-'
            printChar(tmpLayer);
            // 打印员工基本信息
            this.arrayList.get(i).printUserBaseInfo();
            
            // 打印手下员工信息
            this.arrayList.get(i).printEmployeesInfo(tmpLayer);
        }
    }

}
