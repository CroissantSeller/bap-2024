    create sequence asset_history_seq start with 1 increment by 50;

    create sequence assets_seq start with 1 increment by 50;

    create sequence company_seq start with 1 increment by 50;

    create sequence expenses_sources_seq start with 1 increment by 50;

    create sequence income_sources_seq start with 1 increment by 50;

    create sequence stock_list_seq start with 1 increment by 50;

    create sequence users_seq start with 1 increment by 50;

    create table asset_history (
        date date not null,
        total_value float4 not null,
        assets_id bigint,
        id bigint not null,
        primary key (id)
    );

    create table assets (
        total_assets float4 not null,
        id bigint not null,
        primary key (id)
    );

    create table company (
        amount_of_shares float4 not null,
        last_dividend_payment date not null,
        value_per_share float4 not null,
        id bigint not null,
        name varchar(64) not null,
        primary key (id)
    );

    create table expenses_sources (
        amount float4 not null,
        date date not null,
        assets_id bigint,
        id bigint not null,
        expenses_category varchar(64) not null check (expenses_category in ('Food','Rent','Utilities','Loan','Tax','Education','Clothing','SelfCare','Phone','Transport','Holiday','Subscriptions','Entertainment','Household','MajorPurchases','Miscellaneous')),
        primary key (id)
    );

    create table income_sources (
        amount float4 not null,
        date date not null,
        assets_id bigint,
        id bigint not null,
        income_category varchar(64) not null check (income_category in ('FixedIncome','Investments','Bonus','Sales','Tax','Miscellaneous')),
        primary key (id)
    );

    create table stock (
        buy_date date not null,
        sell_date date not null,
        value float4 not null,
        company_id bigint not null,
        stock_name varchar(64) not null,
        list_of_stock_id bigint,
        user_id bigint,
        primary key (stock_name)
    );

    create table stock_list (
        id bigint not null,
        list_of_stock varchar(64),
        primary key (id),
        foreign key (list_of_stock) references stock(stock_name)
    );

    create table users (
        id bigint not null,
        email varchar(64) not null,
        password varchar(64) not null,
        username varchar(64) not null,
        primary key (id)
    );
    CREATE TABLE IF NOT EXISTS flyway_schema_history (
        installed_rank INTEGER PRIMARY KEY,
        version VARCHAR(50),
        description VARCHAR(200),
        type VARCHAR(20),
        script VARCHAR(1000),
        checksum INTEGER,
        installed_by VARCHAR(100),
        installed_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        execution_time INTEGER,
        success BOOLEAN
    );

    alter table if exists asset_history 
       add constraint FKog9sbs8lubo1fmt44xh2her3g 
       foreign key (assets_id) 
       references assets;

    alter table if exists expenses_sources 
       add constraint FKi28b7dmbqhc4xbfe4sdmkpmug 
       foreign key (assets_id) 
       references assets;

    alter table if exists income_sources 
       add constraint FKs7rvkibsm1ybcfd8dk283y811 
       foreign key (assets_id) 
       references assets;

    alter table if exists stock 
       add constraint FK9r297vk0rghnrccw09x0qybfj 
       foreign key (company_id) 
       references company;

    alter table if exists stock_list
       add constraint FK_StockList_Stock 
       foreign key (list_of_stock)
       references stock;

    alter table if exists stock
        add constraint FK12uhb2jh3b1ou2bh1ouh23b1
        foreign key (user_id)
        references users