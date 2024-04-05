package cn.laoazhang.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author laoazhang
 * @CreateTime 2024/4/5 23:37
 * @Version 1.0
 */
public class Folder extends Root{

    List<Root> folders = new ArrayList<>();

    public List<Root> getFolders() {
        return folders;
    }

    public void setFolders(List<Root> folders) {
        this.folders = folders;
    }

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {
        folders.add(root);
    }

    @Override
    public void removeFile(Root root) {
        folders.remove(root);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<depth; i++){
            sb.append("-");
        }
        // 打印橫线和当前文件名
        System.out.println(sb.toString()+this.getName());

        for (Root r : folders){
            // 每个下级，横线多2个
            r.display(depth+2);
        }
    }
}
