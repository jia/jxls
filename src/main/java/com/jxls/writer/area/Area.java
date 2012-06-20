package com.jxls.writer.area;

import com.jxls.writer.command.Command;
import com.jxls.writer.common.*;
import com.jxls.writer.transform.Transformer;

import java.util.List;

/**
 * Generic interface for excel area processing
 * @author Leonid Vysochyn
 *         Date: 1/18/12
 */
public interface Area {
    Size applyAt(CellRef cellRef, Context context);
    void clearCells();

    CellRef getStartCellRef();
    Size getSize();
    
    AreaRef getAreaRef();

    List<CommandData> getCommandDataList();
    void addCommand(AreaRef ref, Command command);

    Transformer getTransformer();
    void processFormulas();
    
    void addAreaListener(AreaListener listener);
    List<AreaListener> getAreaListeners();

    List<Command> findCommandByName(String name);

    void reset();
}
