package Composite.company;
/**
 * 员工抽象
 * @author i
 *
 */
public abstract class Staff {
    // 员工号
    protected String no;
    // 职工姓名
    protected String name;
    // 职位
    protected String position;
    // 薪资
    protected int salary;
    
    // 私有属性, 字符串长度
    private int length;

    // 构造方法
    public Staff(String no, String name, String position, int salary) {
        super();
        this.no = no;
        this.name = name;
        this.position = position;
        this.salary = salary;
        
        // 计算总字节长度
        this.length += (no == null || "".equals(no.trim())) ? 0
                : no.getBytes().length;
        this.length += (name == null || "".equals(name.trim())) ? 0
                : name.getBytes().length;
        this.length += (position == null || "".equals(position.trim())) ? 0
                : position.getBytes().length;
        this.length += String.valueOf(salary).getBytes().length;
    }
    
    // 获得用户基本信息
    public void printUserBaseInfo() {
        System.out.println("|" + this.no + " " + this.name + " "
                + this.position + " " + this.salary + " " + this.length);
    }
    
    // 增加员工信息
    public abstract void add(Staff staff);

    // 删除员工
    public abstract Staff remove(String no);

    // 打印员工信息
    public abstract void printEmployeesInfo(int layer);
    
    // 打印若干字符
    protected void printChar(int layer) {
        for (int j = 0; j < layer * 2; j++) {
            System.out.print("-");
        }
    }
    
    // 私有方法打印一行
    protected void printLine() {
        System.out.println("+");
        for (int i = 0; i < this.length + 4; i++) {
            System.out.print("-");
        }
        System.out.print("-");
    }

    // 理论上各种set要重新计算length的, 下面好像懒得写了
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
    
}
