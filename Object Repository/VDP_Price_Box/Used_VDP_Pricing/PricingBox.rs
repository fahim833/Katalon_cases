<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>PricingBox</name>
   <tag></tag>
   <elementGuidId>1a13b98d-bacd-4e35-b11f-8d625d54c477</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Privacy'])[1]/following::div[4]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>clearfix box box-padding box-border vdp-sidebar-main</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>




Used 2018 Chrysler300 LimitedVIN: 2C3CCAKG1JH267931  Stock: P2047 

Detailed PricingBuyer's Guide$31,495Lynch Savings-$6,596Lynch Price$24,899Lynch PriceDetails$24,899




// Publish instantEprice to DR3/Accelerate iframe
document.addEventListener(&quot;DOMContentLoaded&quot;, function() {
if (window.pubsub &amp;&amp; window.pubsub.subscribe) {
window.pubsub.subscribe('instant-eprice.show', function (data) {
if (data.yourEPrice !== 'PLEASE_CALL') {
var re = new RegExp('^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n]+)');
var mmdFrame = document.getElementById('mmd-frame-frame2');
// null check
if (mmdFrame &amp;&amp; mmdFrame.src &amp;&amp; mmdFrame.src.match(re)[0]) {
mmdFrame.contentWindow.postMessage({&quot;eprice&quot;: Number(data.yourEPrice.replace(/[^0-9\.]+/g,&quot;&quot;))}, mmdFrame.src.match(re)[0]);
}
}
});
}
});








 Ask




 Drive






View Window Sticker






Value Your Trade




Financing Options








We're here to help:						(262) 214-3892					



</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;responsive-grid dodge vdp vdp-responsive multi-franchise chrysler vertical-12 blue-white ddc-site v9-oem-cllc-0003-v1 jeep responsive-type alias-auto-used-details ram js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths mycars-logged-out mycars-toolbar-position-top&quot;]/body[@class=&quot;edm-eva&quot;]/div[@class=&quot;ddc-wrapper&quot;]/div[@class=&quot;main&quot;]/div[@class=&quot;page-bd&quot;]/div[@class=&quot;container vdp-details-container&quot;]/div[@class=&quot;row vdp-details-main&quot;]/div[@class=&quot;sidebar vdp-sidebar responsive-content-default col-xs-4 position-relative&quot;]/div[@class=&quot;clearfix box box-padding box-border vdp-sidebar-main&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Privacy'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[4]/div/div[2]/div</value>
   </webElementXpaths>
</WebElementEntity>
