package com.ppdai.platform.das.console.dto.model.display;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DbSetEntryButton {

    //添加按钮
    public boolean showAddButton;

    //编辑按钮
    public boolean showEditorButton;

    //删除按钮
    public boolean showDeleteButton;

    //同步数据按钮
    public boolean showSyncButton;

    //校验按钮
    public boolean showCkeckButton;

}
