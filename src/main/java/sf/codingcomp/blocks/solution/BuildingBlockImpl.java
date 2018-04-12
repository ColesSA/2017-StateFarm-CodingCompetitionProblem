package sf.codingcomp.blocks.solution;

import java.util.Iterator;

import sf.codingcomp.blocks.BuildingBlock;

public class BuildingBlockImpl implements BuildingBlock {
    
    BuildingBlockImpl over,under;
    
    public BuildingBlockImpl(){
        
    }

    @Override
    public Iterator<BuildingBlock> iterator() {
        return null;
    }

    @Override
    public void stackOver(BuildingBlock b) {
        if(b.getClass()==this.getClass()){
            this.over = (BuildingBlockImpl)b;
            b.stackUnder(this);
        }
    }

    @Override
    public void stackUnder(BuildingBlock b) {
        if(b.getClass()==this.getClass()){
            this.under = (BuildingBlockImpl)b;
            b.stackOver(this);
        }
    }

    @Override
    public BuildingBlock findBlockUnder() {
        if(under!=null)return under;
        else return null;
    }

    @Override
    public BuildingBlock findBlockOver() {
        if(over!=null)return over;
        else return null;
    }
}
