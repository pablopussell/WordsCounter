<#import "MainLayout.ftl" as layout />

<@layout.master title="Company Claim">
<body class="tp-home">
<div id="page" class="js-page as-slide-down">
    <section class="claim-generator">
        <div class="row centered">
            <div class="col c-12 text-center">
                <h2>Company Claim</h2>
            </div>
            <div class="col c-12 claim text-center">
                <div class="row">
                <#list randomWords as randomWord>
                    <div class="col c-4 box">
                        <div class="claim-box-wrap">
                            <div class="claim-box"><h3>${randomWord}</h3></div>
                            <div class="claim-box-back"></div>
                        </div>
                    </div>
                </#list>    
                </div>
            </div>
            <div class="col c-12 text-center">
                <a class="btn large js-generate-claim" href="#">Generate your own claim</a>
            </div>
        </div>
        <div class="row claim-generator-footer">
            <div class="col c-4 medium-third narrow-third">
                <span class="claimcount">8575</span> Claims generated
            </div>
        </div>
    </section>
</@layout.master>