package xiaomo.command.command.impl;

import lombok.extern.slf4j.Slf4j;
import xiaomo.command.bean.Tv;
import xiaomo.command.command.Command;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 19:39
 * desc  : 关电视命令
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class TvOnCommand implements Command {
    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        log.info("执行开电视的撤销操作");
        tv.off();
    }
}
