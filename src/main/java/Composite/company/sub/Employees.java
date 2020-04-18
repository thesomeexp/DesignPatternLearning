package Composite.company.sub;

import Composite.company.Staff;
/**
 * 普通员工(真正干活的人)
 * @author i
 *
 */
public class Employees extends Staff{

    public Employees(String no, String name, String position, int salary) {
        super(no, name, position, salary);
    }

    /** 
     * 添加一个员工
     */
    @Override
    public void add(Staff staff) {
        return;
    }

    /** 
     * 删除一个员工
     */
    @Override
    public Staff remove(String no) {
        return null;
    }

    /**
     * 打印员工信息
     */
    @Override
    public void printEmployeesInfo(int layer) {
        return;
    }

}
