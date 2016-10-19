
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.TransferHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer 4738
 */
public class MyTransferHandler extends javax.swing.TransferHandler{

    @Override
    public boolean canImport(TransferSupport support) {
        return support.isDataFlavorSupported(DataFlavor.stringFlavor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Transferable createTransferable(JComponent c) {
        return new StringSelection(exportString(c)); //To change body of generated methods, choose Tools | Templates.
    }
    private int indices[];
    private Object[] values;
    private String exportString(JComponent c){
        JList list=(JList)c;
        indices=list.getSelectedIndices();
        values=list.getSelectedValues();
//        StringBuffer strBuild=new StringBuffer();
//        for(int i=0;i<values.length;i++){
//            Object val=values[i].toString();
//            strBuild.append(val==null?"": val.toString());
//            if(i!=values.length-1)
//                strBuild.append("\n");
//        }
//        return strBuild.toString();
        return "";
    }
    
    @Override
    public boolean importData(TransferSupport support) {
        if(!support.isDrop())
            return false;
        JList list=(JList)support.getComponent();
        DefaultListModel<String> mod=(DefaultListModel)list.getModel();
        JList.DropLocation locate=(JList.DropLocation)support.getDropLocation();
        int dropIndex=locate.getIndex();
        //boolean isInserted=locate.isInsert();
//        Transferable t=(Transferable) support.getTransferable();
//        String data;
//        try {
//            data=(String)t.getTransferData(DataFlavor.stringFlavor);
//        } catch (Exception e) {
//            return false;
//        }
//        
//        System.out.print(mod.size());
//        String arrayData[]=data.split("\n");
//        if(isInserted)
//            for(String temp:arrayData){
//                mod.add(dropIndex, temp);
//            }
//        else
//            mod.set(dropIndex, arrayData[0]);
//        for(int temp:indices){
//            if(temp==dropIndex){
//                return false;
//            }
//        }
        
        //if(dropIndex >= 0 && dropIndex <= mod.size()) {
//            for(int temp:indices){
//                if(dropIndex==temp+1){
//                    //dropIndex=temp;
//                    break;
//                }
//                    
//            }
//            System.out.println(dropIndex);
//            for (Object tem : values) {
//                mod.add(dropIndex, String.valueOf(tem));
//            }
            for(int i=values.length-1;i>=0;i--){
                mod.add(dropIndex, String.valueOf(values[i]));
            }
            int indexLength=indices.length;
            for(int i=0;i<indexLength;i++){
                if(indices[i]>=dropIndex){
                    mod.remove(indices[i]-i+indexLength);
                }
                    
                else{
                    mod.remove(indices[i]-i);
                }                
            }        
        
        //}
        
        return true;
    }

    @Override
    public int getSourceActions(JComponent c) {
        return TransferHandler.COPY_OR_MOVE; //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    protected void exportDone(JComponent source, Transferable data, int action) {
//        cleanUp(source, action==TransferHandler.MOVE);
//    }
//    
//    public void cleanUp(JComponent c,boolean remove){
//        if(remove && indices!=null){
//            JList list=(JList)c;
//            //DefaultListModel<String>
//        }
//    }

    

    

    
    
}
